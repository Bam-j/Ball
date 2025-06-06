import './Header.scss';

export const Header = () => {
  const logoSrc = '';
  const handleSave = () => {};
  const handleLogout = () => {};

  return (
    <header>
      <img src={logoSrc} alt="Ball Logo" />

      <div className="btn-group">
        <button className="btn btn-save" onClick={handleSave}>
          저장
        </button>
        <button className="btn btn-logout" onClick={handleLogout}>
          로그아웃
        </button>
      </div>
    </header>
  );
};

export default Header;
