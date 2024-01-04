package org.example.ch13;

class InnerVsLambdaThis {
    InnerVsLambdaThis() {
        Runnable lambdaRun = () -> System.out.println(this.getClass().getName());

        Runnable innerRun = new Runnable() {
            @Override
            public void run() {
                System.out.println(this.getClass().getName());
            }
        };

        lambdaRun.run();
        innerRun.run();
    }

    public static void main(String[] args) {
        new InnerVsLambdaThis();
    }
}
