package org.example.creational.prototype;


public class SwordMan extends GameUnit{

    private UnitState state = UnitState.IDLE;

    public void attack(){
        this.state = UnitState.ATTACKING;
    }

    @Override
    public String toString() {
        return String.format("SwordMan State : %s, Position : %s ", this.state, this.getPosition());
    }

    @Override
    protected void reset() {
        this.state = UnitState.IDLE;
    }


}
