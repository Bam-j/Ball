import { Outlet } from 'react-router-dom';

export const AuthLayout = () => {
  return (
    <>
      <Header />
      <main>
        <Outlet />
      </main>
    </>
  );
};

export default AuthLayout;
