<div id= "main-container">
    <!-- saerch 와 menu -->
    <div id= "search-and-menu">
        <div id= "search"></div>
        <div id= "menu"></div>
    </div>
     <!-- announcement 와 best&worst 코디 -->
     <div id= "announcement-and-best-worst">
        <div id= "announcement"></div>
        <div id= "best-worst"></div>
     </div>
      <!-- recommand 오늘의 추천 코디 -->
      <div id= "recommand"></div>
    </div>

<style>
    #main-container {
        display: flex;
        flex-direction: column;
        align-items: center;
        justify-content: flex-start;
        width: 700px;
        height:1920px;
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
        border-radius: 8px;
        box-shadow: 0 1px 3px rgba(0,0,0,0.1);
    } 
    
    /* full-width bottom row */
    #recommand {
        width: 100%;
        height: 140px;
        background: #ffffff;
        border-radius: 8px;
        box-shadow: 0 1px 3px rgba(0,0,0,0.1);
    }
</style>