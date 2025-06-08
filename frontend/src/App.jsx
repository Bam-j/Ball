import { Route, Routes } from 'react-router-dom';

import { MainLayout } from '@/layout/MainLayout';
import { AuthLayout } from '@/layout/AuthLayout';
import { MainPage } from '@/features/main/MainPage';
import { AuthPage } from '@/features/auth/authpage/AuthPage';

export const App = () => {
  return (
    <Routes>
      <Route path="/" element={<MainLayout />}>
        <Route index element={<MainPage />}></Route>
      </Route>

      <Route path="/sign-in" element={<AuthLayout />}>
        <Route element={<AuthPage />}></Route>
      </Route>
    </Routes>
  );
};
