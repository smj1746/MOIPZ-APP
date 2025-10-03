<!-- 바깥 흰색 배경 -->
<div class="outer-container">
    <!-- 메인 페이지와 같은 크기의 초록색 컨테이너 -->
    <div class="login-container">
        <!-- 상단 아이콘과 제목 섹션 -->
        <div class="top-section">
            <h1 class="app-title">MOIP-Z: 나만의 옷장, 코디 추천 앱</h1>
            
            <!-- 아이콘 방정식들 -->
            <div class="icon-equations">
                <!-- 첫 번째 방정식: 옷걸이 + 옷 = 옷장 -->
                <div class="equation-row">
                    <div class="icon hanger-icon">👔</div>
                    <span class="operator">+</span>
                    <div class="icon outfit-icon">👕</div>
                    <span class="operator">=</span>
                    <div class="icon wardrobe-icon">🏠</div>
                </div>
                
                <!-- 두 번째 방정식: 사람 + 옷 = 스타일링된 사람 -->
                <div class="equation-row">
                    <div class="icon person-icon">👤</div>
                    <span class="operator">+</span>
                    <div class="icon outfit-icon">👕</div>
                    <span class="operator">=</span>
                    <div class="icon styled-person-icon">✨</div>
                </div>
                
                <!-- 세 번째 방정식: 옷장 + 스타일링된 사람 = 정리된 옷걸이 -->
                <div class="equation-row">
                    <div class="icon wardrobe-icon">🏠</div>
                    <span class="operator">+</span>
                    <div class="icon styled-person-icon">✨</div>
                    <span class="operator">=</span>
                    <div class="icon clothes-rack-icon">👗</div>
                </div>
            </div>
        </div>

        <!-- 로그인 폼 섹션 -->
        <div class="login-section">
            <h2 class="login-title">&lt;로그인&gt;</h2>
            
            <form class="login-form">
                <div class="input-group">
                    <label for="username">아이디:</label>
                    <input type="text" id="username" name="username" required>
                </div>
                
                <div class="input-group">
                    <label for="password">비밀번호:</label>
                    <input type="password" id="password" name="password" required>
                </div>
            </form>
        </div>

        <!-- 하단 버튼 섹션 -->
        <div class="bottom-section">
            <div class="bottom-buttons">
                <a href="#" class="signup-link">회원가입</a>
                <button type="submit" class="login-button">로그인</button>
            </div>
            <a href="#" class="forgot-password">비밀번호를 잊으셨나요?</a>
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
    .login-container {
        display: flex;
        flex-direction: column;
        align-items: center;
        justify-content: flex-start;
        width: 700px;
        min-height: 100vh;
        background-color: #99FBC2;
        padding: 16px;
        gap: 16px;
        box-sizing: border-box;
        font-family: Arial, sans-serif;
    }

    /* 상단 섹션 */
    .top-section {
        display: flex;
        flex-direction: column;
        align-items: center;
        text-align: center;
        margin-bottom: 20px;
    }

    .app-title {
        font-size: 24px;
        font-weight: bold;
        color: #333;
        margin-bottom: 20px;
    }

    .icon-equations {
        display: flex;
        flex-direction: column;
        gap: 15px;
    }

    .equation-row {
        display: flex;
        align-items: center;
        justify-content: center;
        gap: 12px;
    }

    .icon {
        font-size: 28px;
        width: 45px;
        height: 45px;
        display: flex;
        align-items: center;
        justify-content: center;
        background: white;
        border-radius: 8px;
        box-shadow: 0 2px 4px rgba(0,0,0,0.1);
    }

    .operator {
        font-size: 20px;
        font-weight: bold;
        color: #333;
    }

    /* 로그인 섹션 */
    .login-section {
        background: white;
        padding: 20px;
        border-radius: 12px;
        box-shadow: 0 2px 4px rgba(0,0,0,0.1);
        width: 100%;
        margin-bottom: 20px;
    }

    .login-title {
        text-align: center;
        font-size: 18px;
        color: #333;
        margin-bottom: 15px;
    }

    .login-form {
        display: flex;
        flex-direction: column;
        gap: 15px;
    }

    .input-group {
        display: flex;
        flex-direction: column;
        gap: 6px;
    }

    .input-group label {
        font-size: 14px;
        color: #333;
        font-weight: 500;
    }

    .input-group input {
        padding: 10px;
        border: 2px solid #ddd;
        border-radius: 6px;
        font-size: 14px;
        transition: border-color 0.3s;
    }

    .input-group input:focus {
        outline: none;
        border-color: #99FBC2;
    }

    /* 하단 섹션 */
    .bottom-section {
        display: flex;
        flex-direction: column;
        align-items: center;
        gap: 10px;
    }

    .bottom-buttons {
        display: flex;
        align-items: center;
        gap: 15px;
    }

    .signup-link {
        color: #666;
        text-decoration: none;
        font-size: 12px;
    }

    .signup-link:hover {
        color: #333;
    }

    .login-button {
        background-color: #666;
        color: white;
        border: none;
        padding: 10px 25px;
        border-radius: 6px;
        font-size: 14px;
        cursor: pointer;
        transition: background-color 0.3s;
    }

    .login-button:hover {
        background-color: #555;
    }

    .forgot-password {
        color: #666;
        text-decoration: none;
        font-size: 11px;
    }

    .forgot-password:hover {
        color: #333;
    }

    /* 반응형 디자인 */
    @media (max-width: 768px) {
        .login-container {
            width: 100%;
            max-width: 400px;
            padding: 12px;
        }
        
        .app-title {
            font-size: 20px;
        }
        
        .icon {
            font-size: 24px;
            width: 40px;
            height: 40px;
        }
        
        .operator {
            font-size: 18px;
        }
        
        .login-section {
            padding: 15px;
        }
    }
</style>