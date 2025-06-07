import '@/features/ball/Ball.scss';

export const Ball = () => {
  const ballImgSrc = "";

  return (
    <div className="ball-warpper">
      <img src={ballImgSrc} className="ball" alt="Ball Image"/>
    </div>
  );
};
