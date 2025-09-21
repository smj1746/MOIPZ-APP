<div id="main-container">
    <!-- 상단 바 -->
    <div id="top-bar">
        <button class="menu-btn">☰</button>
        <div class="brand">MOIP-Z</div>
        <button class="menu-btn">⋮</button>
    </div>

    <!-- 검색어 입력 -->
    <div id="search-section">
        <input type="text" placeholder="검색어 입력" class="search-input" />
        <button class="search-btn">🔍</button>
    </div>

    <!-- 공지사항과 Best/Worst -->
    <div id="announcement-and-best">
        <div id="announcement">
            <h3>공지사항</h3>
            <div class="notice-item">
                <span class="notice-icon">📄</span>
                <span>공지</span>
            </div>
        </div>
        <div id="best-worst">
            <h3>Best & Worst 코디</h3>
            <div class="best-item">
                <span class="best-icon">📷</span>
            </div>
        </div>
        </div>
        
    <!-- 오늘의 추천 코디 -->
    <div id="recommendation">
        <div class="recommend-content">
            <div class="recommend-text">
                <h3>오늘의 추천 코디</h3>
                <p>날씨/일정 기반으로 추천을 받아보세요</p>
            </div>
            <button class="recommend-btn">스타일 추천받기</button>
         </div>
     </div>

    <!-- 기능 그리드 -->
    <div id="feature-grid">
        <div class="grid-card">나의 옷장</div>
        <div class="grid-card">코디 추천</div>
        <div class="grid-card">브랜드 가격비교</div>
        <div class="grid-card">친구 피드</div>
        <div class="grid-card">스타일 캘린더</div>
        <div class="grid-card">설정</div>
    </div>

    <!-- 로고 배너 -->
    <div id="logo-banner">
        <div class="logo-icons">
            <div class="icon">👕</div>
            <div class="icon">👔</div>
            <div class="icon">👗</div>
            <div class="icon">🧥</div>
            <div class="icon">👖</div>
        </div>
        <div class="banner-text">
            <p class="main-text">세상에 있는 모든 옷장 중 마지막 옷장의 옷을 찾아 입는 그 날까지!</p>
            <p class="app-text">나만의 옷장, MOIP-Z 앱</p>
        </div>
    </div>

    <!-- 하단 내비게이션 바 -->
    <nav id="bottom-nav">
        <button class="nav-item">
            <span class="nav-icon">☰</span>
        </button>
        <button class="nav-item">
            <span class="nav-icon">★</span>
        </button>
        <button class="nav-item active">
            <span class="nav-icon">🏠</span>
        </button>
        <button class="nav-item">
            <span class="nav-icon">👥</span>
        </button>
        <button class="nav-item">
            <span class="nav-icon">👤</span>
        </button>
    </nav>
</div>

<style>
    #main-container {
        display: flex;
        flex-direction: column;
        width: 100%;
        max-width: 400px;
        min-height: 100vh;
        margin: 0 auto;
        background-color: #a8f2cf;
        padding: 16px;
        gap: 16px;
        position: relative;
        padding-bottom: 80px; /* 내비게이션 바 공간 확보 */
    }

    /* 상단 바 */
    #top-bar {
        display: flex;
        justify-content: space-between;
        align-items: center;
        padding: 8px 0;
    }

    .brand {
        font-weight: bold;
        font-size: 18px;
    }

    .menu-btn {
        background: none;
        border: none;
        font-size: 20px;
        cursor: pointer;
        padding: 8px;
        border-radius: 4px;
    }

    .menu-btn:hover {
        background-color: rgba(0,0,0,0.1);
    }

    /* 검색 섹션 */
    #search-section {
        display: flex;
        align-items: center;
        gap: 8px;
    }

    .search-input {
        flex: 1;
        height: 40px;
        border: none;
        border-radius: 20px;
        padding: 0 16px;
        font-size: 16px;
        outline: none;
    }

    .search-btn {
        background: none;
        border: none;
        font-size: 20px;
        cursor: pointer;
        padding: 8px;
    }

    /* 공지사항과 Best/Worst */
    #announcement-and-best {
        display: flex;
        gap: 12px;
    }

    #announcement, #best-worst {
        flex: 1;
        background: white;
        border-radius: 12px;
        padding: 16px;
        box-shadow: 0 2px 4px rgba(0,0,0,0.1);
        height: 120px;
    }

    #announcement h3, #best-worst h3 {
        margin: 0 0 12px 0;
        font-size: 14px;
        font-weight: bold;
    }

    .notice-item, .best-item {
        display: flex;
        align-items: center;
        gap: 8px;
        font-size: 12px;
    }

    .notice-icon, .best-icon {
        font-size: 16px;
    }

    /* 추천 코디 */
    #recommendation {
        background: white;
        border-radius: 12px;
        padding: 20px;
        box-shadow: 0 2px 4px rgba(0,0,0,0.1);
    }

    .recommend-content {
        display: flex;
        justify-content: space-between;
        align-items: center;
    }

    .recommend-text h3 {
        margin: 0 0 8px 0;
        font-size: 16px;
        font-weight: bold;
    }

    .recommend-text p {
        margin: 0;
        font-size: 12px;
        color: #666;
    }

    .recommend-btn {
        background: #ff5ec3;
        color: white;
        border: none;
        border-radius: 20px;
        padding: 10px 16px;
        font-size: 12px;
        font-weight: bold;
        cursor: pointer;
    }

    .recommend-btn:hover {
        background: #e54db8;
    }

    /* 기능 그리드 */
    #feature-grid {
        display: grid;
        grid-template-columns: 1fr 1fr;
        gap: 12px;
    }

    .grid-card {
        background: white;
        border-radius: 12px;
        padding: 20px;
        box-shadow: 0 2px 4px rgba(0,0,0,0.1);
        text-align: center;
        font-size: 14px;
        font-weight: 500;
        cursor: pointer;
        transition: transform 0.2s ease;
        height: 80px;
        display: flex;
        align-items: center;
        justify-content: center;
    }

    .grid-card:hover {
        transform: translateY(-2px);
        box-shadow: 0 4px 8px rgba(0,0,0,0.15);
    }

    /* 로고 배너 */
    #logo-banner {
        background: white;
        border-radius: 12px;
        padding: 20px;
        box-shadow: 0 2px 4px rgba(0,0,0,0.1);
        margin-bottom: 16px;
    }

    .logo-icons {
        display: flex;
        justify-content: space-between;
        align-items: center;
        margin-bottom: 16px;
        flex-wrap: wrap;
        gap: 8px;
    }

    .icon {
        font-size: 24px;
        padding: 8px;
        background: #f8f9fa;
        border-radius: 8px;
        min-width: 40px;
        text-align: center;
        border: 2px solid transparent;
        transition: all 0.2s ease;
    }

    .icon:nth-child(7) {
        border-color: #ff6b35;
        background: #fff5f2;
    }

    .banner-text {
        text-align: left;
    }

    .main-text {
        font-size: 14px;
        color: #333;
        margin: 0 0 8px 0;
        line-height: 1.4;
    }

    .app-text {
        font-size: 12px;
        color: #666;
        margin: 0;
        font-weight: 500;
    }

    /* 하단 내비게이션 바 */
    #bottom-nav {
        display: flex;
        justify-content: space-around;
        align-items: center;
        background: #f8f9fa;
        border-top: 1px solid #e9ecef;
        padding: 8px 0;
        position: fixed;
        bottom: 0;
        left: 50%;
        transform: translateX(-50%);
        width: 100%;
        max-width: 400px;
        height: 60px;
        z-index: 1000;
    }

    .nav-item {
        background: none;
        border: none;
        cursor: pointer;
        padding: 8px;
        border-radius: 8px;
        transition: background-color 0.2s ease;
        display: flex;
        flex-direction: column;
        align-items: center;
        gap: 4px;
    }

    .nav-item:hover {
        background-color: rgba(0,0,0,0.05);
    }

    .nav-item.active {
        background-color: #a8f2cf;
    }

    .nav-icon {
        font-size: 20px;
        color: #6c757d;
    }

    .nav-item.active .nav-icon {
        color: #20c997;
    }
</style>