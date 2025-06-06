import {Outlet} from "react-router-dom";

export const MainLayout = () => {
    return (
        <>
            <Header/>
            <main>
                <Outlet/>
            </main>
        </>
    )
}

export default MainLayout;
