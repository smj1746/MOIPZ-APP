<!-- 바깥 흰색 배경 -->
<div class="outer-container">
    <!-- 메인 페이지와 같은 크기의 초록색 컨테이너 -->
    <div id="main-container">
        <!-- 상단 헤더 -->
        <div id="header">
            <div class="menu-icon">☰</div>
            <div class="app-title">MOIP-Z</div>
            <div class="more-icon">⋮</div>
        </div>

        <!-- 검색 바 -->
        <div id="search-bar">
            <input type="text" placeholder="검색어 입력" class="search-input">
            <div class="search-icon">🔍</div>
        </div>

        <!-- 내코디 평가와 새옷 등록 아이콘 -->
        <div id="main-actions">
            <div class="action-item">
                <div class="action-icon">
                    <div class="thumbs-up">👍</div>
                    <div class="stars">⭐⭐⭐</div>
                </div>
                <button class="action-button">내 코디 평가</button>
            </div>
            <div class="action-item">
                <div class="action-icon">
                    <div class="camera-icon">📷</div>
                    <div class="plus-icon">+</div>
                </div>
                <button class="action-button">새 옷 등록</button>
            </div>
        </div>

        <!-- 옷장 사진 섹션 -->
        <div id="wardrobe-section">
            <div class="wardrobe-container">
                <div class="wardrobe-header">
                    <h3>나만의 옷장</h3>
                </div>
                <div class="wardrobe-content">
                    <div class="wardrobe-icon">👔👕👗🧥👖</div>
                    <div class="wardrobe-text">
                        <p>세상에 있는 모든 옷장 중 마지막 옷장의 옷을 찾아 입는</p>
                        <p>그 날까지!</p>
                        <p>나만의 옷장, MOIP-Z 앱</p>
                    </div>
                </div>
            </div>
        </div>

        <!-- search 와 menu -->
        <div id="search-and-menu">
            <div id="search"></div>
            <div id="menu"></div>
        </div>
         <!-- announcement 와 best&worst 코디 -->
         <div id="announcement-and-best-worst">
            <div id="announcement"></div>
            <div id="best-worst"></div>
         </div>
          <!-- recommand 오늘의 추천 코디 -->
          <div id="recommand"></div>

        <!-- 하단 내비게이션 바 -->
        <div id="bottom-navigation">
            <div class="nav-item">
                <div class="nav-icon">☰</div>
            </div>
            <div class="nav-item">
                <div class="nav-icon">⭐</div>
            </div>
            <div class="nav-item active">
                <div class="nav-icon">🏠</div>
            </div>
            <div class="nav-item">
                <div class="nav-icon">👥</div>
            </div>
            <div class="nav-item">
                <div class="nav-icon">👤</div>
            </div>
        </div>
    </div>
</div>

<style>
    /* 바깥 흰색 배경 컨테이너 */
    .outer-container {
        display: flex;
        justify-content: center;
        align-items: flex-start;
        min-height: 100vh;
        background-color: #ffffff;
        padding: 20px 0;
        box-sizing: border-box;
    }

    /* 메인 페이지와 같은 크기의 초록색 컨테이너 */
    #main-container {
        display: flex;
        flex-direction: column;
        align-items: center;
        justify-content: flex-start;
        width: 700px;
        min-height: 100vh;
        background-color: #99FBC2;
        gap: 16px;
        padding: 16px;
        box-sizing: border-box;
        font-family: Arial, sans-serif;
    }
    
    /* rows with two columns */
    #search-and-menu,
    #announcement-and-best-worst {
        display: flex;
        width: 100%;
        gap: 16px;
    }
    
    /* each cell box */
    #search,
    #menu,
    #announcement,
    #best-worst {
        flex: 1;
        height: 200px;
        background: #ffffff;
        border-radius: 12px;
        box-shadow: 0 2px 4px rgba(0,0,0,0.1);
        padding: 16px;
        box-sizing: border-box;
    } 
    
    /* full-width bottom row */
    #recommand {
        width: 100%;
        height: 140px;
        background: #ffffff;
        border-radius: 12px;
        box-shadow: 0 2px 4px rgba(0,0,0,0.1);
        padding: 16px;
        box-sizing: border-box;
    }

    /* 상단 헤더 */
    #header {
        display: flex;
        justify-content: space-between;
        align-items: center;
        padding: 12px 0;
        width: 100%;
    }

    .menu-icon, .more-icon {
        font-size: 20px;
        cursor: pointer;
        padding: 8px;
        border-radius: 4px;
    }

    .menu-icon:hover, .more-icon:hover {
        background-color: rgba(0,0,0,0.1);
    }

    .app-title {
        font-size: 18px;
        font-weight: bold;
        color: #333;
    }

    /* 검색 바 */
    #search-bar {
        display: flex;
        align-items: center;
        background: white;
        border-radius: 20px;
        padding: 8px 16px;
        margin-bottom: 16px;
        box-shadow: 0 2px 4px rgba(0,0,0,0.1);
    }

    .search-input {
        flex: 1;
        border: none;
        outline: none;
        font-size: 14px;
        padding: 8px;
    }

    .search-icon {
        font-size: 16px;
        color: #666;
    }

    /* 내코디 평가와 새옷 등록 아이콘 */
    #main-actions {
        display: flex;
        justify-content: space-around;
        width: 100%;
        margin-bottom: 16px;
    }

    .action-item {
        display: flex;
        flex-direction: column;
        align-items: center;
        gap: 8px;
    }

    .action-icon {
        position: relative;
        width: 60px;
        height: 60px;
        background: #f0f0f0;
        border-radius: 50%;
        display: flex;
        align-items: center;
        justify-content: center;
        font-size: 24px;
    }

    .thumbs-up {
        font-size: 24px;
    }

    .stars {
        position: absolute;
        top: -5px;
        right: -5px;
        font-size: 12px;
        color: #ffd700;
    }

    .camera-icon {
        font-size: 20px;
    }

    .plus-icon {
        position: absolute;
        top: 5px;
        right: 5px;
        width: 16px;
        height: 16px;
        background: #333;
        color: white;
        border-radius: 50%;
        display: flex;
        align-items: center;
        justify-content: center;
        font-size: 12px;
        font-weight: bold;
    }

    .action-button {
        background: #666;
        color: white;
        border: none;
        padding: 8px 16px;
        border-radius: 6px;
        font-size: 12px;
        cursor: pointer;
        transition: background-color 0.3s;
    }

    .action-button:hover {
        background: #555;
    }

    /* 옷장 사진 섹션 */
    #wardrobe-section {
        width: 100%;
        margin-bottom: 16px;
    }

    .wardrobe-container {
        background: white;
        border-radius: 12px;
        padding: 20px;
        box-shadow: 0 2px 4px rgba(0,0,0,0.1);
    }

    .wardrobe-header h3 {
        margin: 0 0 16px 0;
        font-size: 16px;
        font-weight: bold;
        color: #333;
    }

    .wardrobe-content {
        text-align: center;
    }

    .wardrobe-icon {
        font-size: 32px;
        margin-bottom: 16px;
    }

    .wardrobe-text p {
        margin: 4px 0;
        font-size: 14px;
        color: #333;
        line-height: 1.4;
    }

    /* 하단 내비게이션 바 */
    #bottom-navigation {
        display: flex;
        justify-content: space-around;
        align-items: center;
        background: rgba(255,255,255,0.6);
        border-top-left-radius: 10px;
        border-top-right-radius: 10px;
        padding: 10px 0;
        margin-top: auto;
    }

    .nav-item {
        display: flex;
        flex-direction: column;
        align-items: center;
        cursor: pointer;
        padding: 8px;
        border-radius: 8px;
        transition: background-color 0.3s;
    }

    .nav-item:hover {
        background-color: rgba(0,0,0,0.1);
    }

    .nav-item.active {
        background-color: #99FBC2;
    }

    .nav-icon {
        font-size: 20px;
        margin-bottom: 4px;
    }

    /* 반응형 디자인 */
    @media (max-width: 768px) {
        .outer-container {
            padding: 10px 0;
        }
        
        #main-container {
            width: 100%;
            max-width: 400px;
            padding: 12px;
            gap: 12px;
        }
        
        .app-title {
            font-size: 16px;
        }
        
        .action-icon {
            width: 50px;
            height: 50px;
            font-size: 20px;
        }
        
        .action-button {
            font-size: 11px;
            padding: 6px 12px;
        }
        
        .wardrobe-container {
            padding: 15px;
        }
        
        .wardrobe-icon {
            font-size: 28px;
        }
        
        .wardrobe-text p {
            font-size: 13px;
        }
        
        #search-and-menu,
        #announcement-and-best-worst {
            gap: 12px;
        }
        
        #search,
        #menu,
        #announcement,
        #best-worst {
            height: 150px;
            padding: 12px;
        }
        
        #recommand {
            height: 120px;
            padding: 12px;
        }
        
        .nav-icon {
            font-size: 18px;
        }
    }

    @media (max-width: 480px) {
        .outer-container {
            padding: 5px 0;
        }
        
        #main-container {
            padding: 8px;
            gap: 8px;
        }
        
        .app-title {
            font-size: 14px;
        }
        
        .action-icon {
            width: 45px;
            height: 45px;
            font-size: 18px;
        }
        
        .action-button {
            font-size: 10px;
            padding: 5px 10px;
        }
        
        .wardrobe-container {
            padding: 12px;
        }
        
        .wardrobe-icon {
            font-size: 24px;
        }
        
        .wardrobe-text p {
            font-size: 12px;
        }
        
        #search-and-menu,
        #announcement-and-best-worst {
            gap: 8px;
        }
        
        #search,
        #menu,
        #announcement,
        #best-worst {
            height: 120px;
            padding: 8px;
        }
        
        #recommand {
            height: 100px;
            padding: 8px;
        }
        
        .nav-icon {
            font-size: 16px;
        }
    }
</style>
