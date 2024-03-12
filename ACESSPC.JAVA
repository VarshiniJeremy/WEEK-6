class AccessSpecifierDemo {
    private int priVar;
    protected int proVar;
    public int pubVar;

    public void setVar(int priValue, int proValue, int pubValue) {
        priVar = priValue;
        proVar = proValue;
        pubVar = pubValue;
    }

    public int getPriVar() {
        return priVar;
    }

    public int getProVar() {
        return proVar;
    }

    public int getPubVar() {
        return pubVar;
    }
}

class AbsEncapJava {
    public static void main(String[] args) {
        AccessSpecifierDemo obj = new AccessSpecifierDemo();
        obj.setVar(7, 8, 9);
        System.out.println("PriVar : " + obj.getPriVar());
        System.out.println("ProVar : " + obj.getProVar());
        System.out.println("PubVar : " + obj.getPubVar());
    }
}
