package Employes;

public class CanCook extends Employees{

    boolean hasKnife = false;

    public void setHasKnife(boolean hasKnife) {
        this.hasKnife = hasKnife;
    }

    boolean getHasKnife(){
        return hasKnife;
    }
}
