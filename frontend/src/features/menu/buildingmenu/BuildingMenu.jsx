import { BuildingList } from '@/features/buildings/buildinglist/BuildingList';

import '@/features/menu/buildingmenu/BuildingMenu.scss';

export const BuildingMenu = () => {
  return (
    <div className="buildings-wrapper">
      <BuildingList />
    </div>
  );
};
