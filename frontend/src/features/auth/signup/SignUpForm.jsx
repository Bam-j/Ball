import '@/features/auth/signin/SignUpForm.scss';

export const SignUpForm = () => {
  return (
    <section>
      <form className="form-sign-up">
        <input id="input-useranme" className="input-sign-up" placeholder="아이디" />
        <input id="input-password" className="input-sign-up" placeholder="비밀번호" />
        <button className="btn btn-submit">회원가입</button>
      </form>
    </section>
  );
};
