import '@/features/buildings/building/Building.scss';

export const Building = () => {
  const buildingImgSrc = '';
  const buildingName = '';
  const buildingCount = 0;

  const handleBuyBuilding = () => {};

  return (
    <div className="building-elem-wrapper" onClick={handleBuyBuilding}>
      <img src={buildingImgSrc} className="img-building" alt="Building Img" />
      <h2 className="text-building-name">{buildingName}</h2>
      <p className="text-building-count">{buildingCount}</p>
    </div>
  );
};
