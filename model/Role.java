/* Generated by Together */

package model;

public class Role {
    public Role() {
    }

    public int getId() {
    }

    public void setId(int id) {
    }

    public String getName() {
    }

    public void setName(String name) {
    }

    public Member getMembers() {
    }

    public void setMembers(Member members) {
    }

    private int id;
    private String name;

    /**
     * @label has
     * @supplierCardinality 0..*
     * @link aggregationByValue 
     */
    private Member members;
}
