import '@/features/auth/signin/SignInForm.scss';

export const SignInForm = () => {
  return (
    <section>
      <form className="form-sign-in">
        <input id="input-useranme" className="input-sign-in" placeholder="아이디" />
        <input id="input-password" className="input-sign-in" placeholder="비밀번호" />
        <button className="btn btn-submit">로그인</button>
      </form>
    </section>
  );
};
