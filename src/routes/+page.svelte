<!-- 바깥 흰색 배경 -->
<div class="outer-container">
    <!-- 메인 페이지와 같은 크기의 초록색 컨테이너 -->
    <div id="main-container">
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
    }

    @media (max-width: 480px) {
        .outer-container {
            padding: 5px 0;
        }
        
        #main-container {
            padding: 8px;
            gap: 8px;
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
    }
</style>