// update the class
class UncheckedException extends RuntimeException {
    public UncheckedException() {
        super();
    }
}

//do not change the code
class Main {
    public static void main(String[] args) {
        UncheckedException uncheckedException = new UncheckedException();
        System.out.println(uncheckedException instanceof RuntimeException);
    }
}
