// 页面加载完成后执行
document.addEventListener('DOMContentLoaded', function() {
    // 更新状态栏时间
    updateStatusBarTime();
    
    // 添加卡片点击效果
    addCardClickEffects();
    
    // 添加代码块复制功能
    addCodeCopyFeature();
});

// 更新状态栏时间
function updateStatusBarTime() {
    const timeElement = document.querySelector('.status-bar span');
    if (timeElement) {
        const now = new Date();
        const hours = now.getHours().toString().padStart(2, '0');
        const minutes = now.getMinutes().toString().padStart(2, '0');
        timeElement.textContent = `${hours}:${minutes}`;
    }
}

// 添加卡片点击效果
function addCardClickEffects() {
    const cards = document.querySelectorAll('.pattern-card');
    cards.forEach(card => {
        card.addEventListener('click', function() {
            this.style.transform = 'scale(0.98)';
            setTimeout(() => {
                this.style.transform = 'scale(1)';
            }, 100);
        });
    });
}

// 添加代码块复制功能
function addCodeCopyFeature() {
    const codeBlocks = document.querySelectorAll('pre code');
    codeBlocks.forEach(block => {
        const wrapper = block.parentElement;
        const copyButton = document.createElement('button');
        copyButton.className = 'absolute top-2 right-2 bg-gray-700 text-white px-2 py-1 rounded text-sm';
        copyButton.textContent = '复制';
        
        wrapper.style.position = 'relative';
        wrapper.appendChild(copyButton);
        
        copyButton.addEventListener('click', async () => {
            try {
                await navigator.clipboard.writeText(block.textContent);
                copyButton.textContent = '已复制!';
                setTimeout(() => {
                    copyButton.textContent = '复制';
                }, 2000);
            } catch (err) {
                console.error('复制失败:', err);
            }
        });
    });
}

// 添加页面切换动画
document.addEventListener('DOMContentLoaded', function() {
    const links = document.querySelectorAll('a');
    links.forEach(link => {
        link.addEventListener('click', function(e) {
            if (this.href && !this.href.includes('#')) {
                e.preventDefault();
                document.body.style.opacity = '0';
                setTimeout(() => {
                    window.location.href = this.href;
                }, 300);
            }
        });
    });
}); 