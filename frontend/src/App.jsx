import { Route, Routes } from 'react-router-dom';
import { MainLayout } from '@/layout/MainLayout';
import { AuthLayout } from '@/layout/AuthLayout';

export const App = () => {

  return (
    <Routes>
      <Route path="/" element={<MainLayout />}>
        <Route index element={}></Route>
      </Route>

      <Route path="/sign-in" element={<AuthLayout />}>
        <Route element={}></Route>
      </Route>
    </Routes>
  );
};
