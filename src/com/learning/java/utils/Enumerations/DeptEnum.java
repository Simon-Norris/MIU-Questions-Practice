package com.learning.java.utils.Enumerations;

public enum DeptEnum {

    BE("Bachelors of Engineering", 1),
    BCOM("Bachelors of Commerce", 2),
    BSC("Bachelors of Science", 3),
    BARCH("Bachelors of Architecture", 4),
    DEFAULT("Bachelor", 0);

    private String deptName;
    private int deptNo;

    DeptEnum(String deptName, int deptNo){
        this.deptName = deptName;
        this.deptNo = deptNo;
    }

    public String getDeptName(){
        return this.deptName;
    }

    public int getDeptNo(){
        return this.deptNo;
    }

    public static DeptEnum get(String accr){
        for (DeptEnum deptEnum: DeptEnum.values()){
            if (accr.equals(deptEnum.getDeptName())){
                return deptEnum;
            }
        }
        return DeptEnum.DEFAULT;
    }

    public static void main(String[] args){
        DeptEnum env = DeptEnum.valueOf("BE");
        System.out.println(env.getDeptName() + ": "+env.getDeptNo());

        for (DeptEnum deptEnum: DeptEnum.values()){
            System.out.println(deptEnum.getDeptName() + ": "+deptEnum.getDeptNo());
        }

        System.out.println(DeptEnum.BE == DeptEnum.valueOf("BE"));

        // reverse lookup
        System.out.println(DeptEnum.get("Bachelors of Commerce"));
    }
}
