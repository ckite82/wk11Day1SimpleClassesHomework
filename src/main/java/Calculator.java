public class Calculator {
    private int num1;
    private int num2;
    private double dbl1;
    private double dbl2;

    public Calculator(int num1, int num2, double dbl1, double dbl2){
        this.num1 = num1;
        this.num2 = num2;
        this.dbl1 = dbl1;
        this.dbl2 = dbl2;
    }


    public Object getAdd() { return this.num1 + this.num2;
    }

    public int getSubtract() {return this.num1 - this.num2;
    }

    public int getMultiply() {return this.num1 * this.num2;
    }

    public double getDivide() {return this.dbl1 / this.dbl2;
    }
}