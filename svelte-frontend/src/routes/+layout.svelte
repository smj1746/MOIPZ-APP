<script lang="ts">
  import '../app.css';       // ✅ 전역 스타일 한 번만 로드
  let settingsOpen = false;  // 레이아웃이 관리하는 '설정' 패널 상태
</script>

<svelte:head>
  <!-- 아이콘 폰트(옵션) -->
  <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet" />
</svelte:head>


<!-- 메인 컨테이너: 여기에 현재 페이지(+page.svelte)가 들어감 -->
<main class="shell">
  <slot />
</main>

<!-- 하단 내비(레이아웃 공통) -->
<nav class="bottom" aria-label="bottom navigation">
  <a href="/price"     class="nav"><span class="material-icons">menu</span></a>
  <a href="/recommend" class="nav"><span class="material-icons">star</span></a>
  <a href="/"          class="nav active"><span class="material-icons">home</span></a>
  <a href="/friends"   class="nav"><span class="material-icons">groups</span></a>
  <a href="/settings"  class="nav"><span class="material-icons">person</span></a>
</nav>

<!-- 설정 패널(레이아웃이 소유/표시) -->
<aside class="settings" data-open={settingsOpen}>
  <div class="settings__header">
    <strong>설정</strong>
    <button class="icon-btn" aria-label="close" on:click={() => (settingsOpen = false)}>
      <span class="material-icons">close</span>
    </button>
  </div>
  <div class="settings__body">
    <label class="row">
      <span>테마 색상</span>
      <input type="color" value="#99FBC2"
        on:input={(e) => document.documentElement.style.setProperty('--bg', (e.target as HTMLInputElement).value)} />
    </label>
    <label class="row">
      <span>포인트 색</span>
      <input type="color" value="#ff4df0"
        on:input={(e) => document.documentElement.style.setProperty('--accent', (e.target as HTMLInputElement).value)} />
    </label>
    <!-- 필요 설정 더 추가 가능 -->
  </div>
</aside>

<style>
  .topbar{
    position: sticky; top: 0; z-index: 20;
    height: 56px; display: flex; align-items: center; gap: 8px;
    padding: 0 12px; background: var(--bg);
  }
  .topbar h1{margin:0; flex:1; font-size:20px; font-weight:700; color:#fff}
  .icon-btn{display:grid; place-items:center; width:40px; height:40px; color:#fff; background:transparent; border:0}

  .shell{padding:12px 12px 96px} /* 하단 내비와 겹치지 않게 하단 여백 */

  .bottom{
    position:fixed; left:0; right:0; bottom:0; height:72px;
    display:grid; grid-template-columns:repeat(5,1fr);
    background:linear-gradient(180deg, rgba(0,0,0,0), rgba(0,0,0,.06)), #fff;
    box-shadow:0 -4px 12px rgba(0,0,0,.08); z-index:15;
  }
  .bottom .nav{display:grid; place-items:center; color:#444}
  .bottom .nav.active{color:#0a7}

  /* 설정 패널(우측 슬라이드) */
  .settings{
    position:fixed; top:0; right:0; bottom:0; width:320px; z-index:30;
    background:#fff; box-shadow:-6px 0 20px rgba(0,0,0,.12);
    transform: translateX(100%); transition: transform .25s ease;
    display:flex; flex-direction:column;
  }
  .settings[data-open="true"]{ transform: translateX(0); }
  .settings__header{display:flex; align-items:center; justify-content:space-between; padding:12px 12px; border-bottom:1px solid #eee}
  .settings__body{padding:12px; display:grid; gap:12px}
  .row{display:flex; align-items:center; justify-content:space-between; gap:12px}
</style>
