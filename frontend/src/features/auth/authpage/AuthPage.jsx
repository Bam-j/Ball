import '@/features/auth/authpage';

export const AuthPage = () => {
  const logoSrc = "";

  return (
    <div className="auth-from-wrapper">
      <div className="logo-wrapper">
        <img src={logoSrc} alt="Ball Logo"/>
      </div>

      <div className="form-wrapper">
        {/* 조건 분기로 SignIn or SignUp 컴포넌트 렌더링 */}
      </div>
    </div>
  );
};
