import { Ball } from '@/features/ball/Ball';
import { BuildingMenu } from '@/features/menu/buildingmenu/BuildingMenu';

import '@/features/main/MainPage.scss';

export const MainPage = () => {
  return (
    <div className="content-wrapper">
      <Ball />
      <BuildingMenu />
    </div>
  );
};
