<!-- 페이지 전용: 아이콘 폰트(선택) -->
<link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet" />

<script>
  import '../app.css';   // 전역 스타일 한 번만 로드
</script>

<div class="page">
  <!-- 상단 툴바 -->
  <header class="topbar">
    <a class="icon-btn" href="/price" aria-label="menu"><span class="material-icons">sort</span></a>
    <h1>MOIP-Z</h1>
    <a class="icon-btn" href="/settings" aria-label="settings"><span class="material-icons">more_vert</span></a>
  </header>

  <main class="container">
    <!-- 검색 + 우측 메뉴 버튼 -->
    <div class="row row--split">
      <div class="card search">
        <input placeholder="검색어 입력" />
        <span class="material-icons">search</span>
      </div>
      <a class="card square" href="/settings" aria-label="menu">
        <span class="material-icons big">menu</span>
      </a>
    </div>

    <!-- 공지사항 + 오늘의 BEST & WORST -->
    <div class="row">
      <a class="card tall notice" href="/settings" aria-label="notice">
        <div class="card-title">공지사항</div>
        <div class="thumb thumb--icon">
          <!-- 원하면 static/images/announcement.png 추가해서 이미지로 교체 -->
          <img src="/images/annoucment.png" alt= "공지" />
        </div>
      </a>

      <a class="card tall best" href="/recommend" aria-label="best-and-worst">
        <div class="thumb">
        <img src="/images/today_bestandworst_cody.jpg" alt="BEST/WORST" />
        </div>
        <div class="bw-caption">오늘의 BEST &amp; WORST 코디</div>
      </a>
    </div>

    <!-- 오늘의 추천 코디 -->
    <section class="card full today">
      <div class="box">
        <div class="title">오늘의 추천 코디</div>
        <p class="desc">날씨/일정 기반으로 추천을 받아보세요</p>
        <a class="btn primary" href="/recommend">스타일 추천받기</a>
      </div>
    </section>

    <!-- 2×3 빠른 진입 -->
    <section class="grid">
      <a class="card cell" href="/wardrobe">나의 옷장</a>
      <a class="card cell" href="/recommend">코디 추천</a>
      <a class="card cell" href="/price">브랜드 가격비교</a>
      <a class="card cell" href="/friends">친구 피드</a>
      <a class="card cell" href="/calendar">스타일 캘린더</a>
      <a class="card cell" href="/settings">설정</a>
    </section>

    <div class="spacer"></div>
  </main>

  <!-- 하단 내비(이미지 대신 CSS/아이콘) -->
  <nav class="bottom" aria-label="bottom navigation">
    <a href="/price"     class="nav" aria-label="menu"><span class="material-icons">menu</span></a>
    <a href="/recommend" class="nav" aria-label="best"><span class="material-icons">star</span></a>
    <a href="/"          class="nav active" aria-label="home"><span class="material-icons">home</span></a>
    <a href="/friends"   class="nav" aria-label="friends"><span class="material-icons">groups</span></a>
    <a href="/settings"  class="nav" aria-label="my"><span class="material-icons">person</span></a>
  </nav>
</div>

<style>
  /* ✅ 이 블록의 CSS는 이 파일(페이지)에만 적용됨 */
  .page {
    --bg: #99FBC2; --text:#222; --muted:#1d8e7a; --card:#fff; --accent:#ff4df0;
    min-height: 100dvh;
    background: var(--bg);
    color: var(--text);
    font-family: system-ui, -apple-system, Segoe UI, Roboto, "Noto Sans KR", sans-serif;
  }

  /* 상단 툴바 */
  .topbar{
    position: sticky; top: 0; z-index: 10;
    height: 56px; display: flex; align-items: center; gap: 8px;
    padding: 0 12px; background: var(--bg);
  }
  .topbar h1{margin:0; flex:1; font-size:20px; font-weight:700; color:#fff}
  .icon-btn{display:grid; place-items:center; width:40px; height:40px; color:#fff; text-decoration:none}

  /* 본문 컨테이너 */
  .container{padding:12px}
  .row{display:grid; grid-template-columns: 1fr 56px; gap:12px; margin-bottom:12px}

  /* 카드 공통 */
  .card{
    background:var(--card); border-radius:16px; border:0;
    box-shadow:0 2px 6px rgba(0,0,0,.08); text-decoration:none; color:inherit;
  }
  .card.square{display:grid; place-items:center}
  .card.tall{height:180px; padding:12px}
  .card.full{margin:12px 0}
  .card .card-title{font-weight:700; color:var(--muted)}

  /* 검색 카드 */
  .search{position:relative; display:flex; align-items:center; padding:0 44px 0 12px; height:48px}
  .search input{width:100%; height:36px; border:0; outline:none; background:transparent; font-size:15px}
  .search .material-icons{position:absolute; right:12px; color:#666}

  /* 공지/베스트 카드 */
  .img-center{display:grid; place-items:center; height:100%}
  .outline{font-size:72px; color:#7dc4ff}
  .best{position:relative; overflow:hidden}
  .best .cover{
    position:absolute; inset:0;
    background: url("/images/today_bestandworst_cody.jpg") center/cover no-repeat;
    filter:saturate(.95);
  }
  .bw-caption{position:absolute; left:0; right:0; bottom:12px; text-align:center; color:#fffb; font-weight:700}

  /* 오늘의 추천 코디 */
  .today .box{padding:16px}
  .today .title{font-size:18px; font-weight:700}
  .today .desc{margin:6px 0 12px; color:#0b5b50}
  .btn.primary{
    display:inline-block; padding:10px 16px; border-radius:999px;
    background:var(--accent); color:#fff; font-weight:700; text-decoration:none;
  }

  /* 2×2 그리드(세로 3행) */
  .grid{display:grid; grid-template-columns:1fr 1fr; gap:12px}
  .cell{height:100px; display:grid; place-items:center; font-weight:600; text-decoration:none; color:inherit}

  /* 하단 네비 */
  .bottom{
    position:fixed; left:0; right:0; bottom:0; height:72px;
    display:grid; grid-template-columns:repeat(5,1fr);
    background:linear-gradient(180deg, rgba(0,0,0,0), rgba(0,0,0,.06)), #fff;
    box-shadow:0 -4px 12px rgba(0,0,0,.08);
  }
  .bottom .nav{display:grid; place-items:center; color:#444; text-decoration:none}
  .bottom .nav.active{color:#0a7}
  .material-icons.big{font-size:28px}

  .spacer{height:88px} /* 바텀바와 겹치지 않도록 여백 */
</style>
