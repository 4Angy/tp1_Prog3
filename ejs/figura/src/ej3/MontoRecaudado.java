public class MontoRecaudado {
    private float imp1;
    private float imp2;
    private float imp3;
    private float imp4;
    private float imp5;
    private float costosDeMantenimiento;

    public MontoRecaudado(float imp1, float imp2, float imp3, float imp4, float imp5, float costosDeMantenimiento) {
        this.imp1 = imp1;
        this.imp2 = imp2;
        this.imp3 = imp3;
        this.imp4 = imp4;
        this.imp5 = imp5;
        this.costosDeMantenimiento = costosDeMantenimiento;
    }

    public float getImp1() {
        return imp1;
    }

    public void setImp1(float imp1) {
        this.imp1 = imp1;
    }

    public float getImp2() {
        return imp2;
    }

    public void setImp2(float imp2) {
        this.imp2 = imp2;
    }

    public float getImp3() {
        return imp3;
    }

    public void setImp3(float imp3) {
        this.imp3 = imp3;
    }

    public float getImp4() {
        return imp4;
    }

    public void setImp4(float imp4) {
        this.imp4 = imp4;
    }

    public float getImp5() {
        return imp5;
    }

    public void setImp5(float imp5) {
        this.imp5 = imp5;
    }

    public float getCostosDeMantenimiento() {
        return costosDeMantenimiento;
    }

    public void setCostosDeMantenimiento(float costosDeMantenimiento) {
        this.costosDeMantenimiento = costosDeMantenimiento;
    }

    public float getTotalRecaudado() {
        return imp1 + imp2 + imp3 + imp4 + imp5;
    }

    public boolean estaEnDeficit() {
        return getTotalRecaudado() < costosDeMantenimiento;
    }
}
