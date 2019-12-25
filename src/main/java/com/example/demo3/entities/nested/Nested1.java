package com.example.demo3.entities.nested;

import com.example.demo3.entities.nested.first.Nested11;
import com.example.demo3.entities.nested.first.Nested12;
import com.example.demo3.entities.nested.first.Nested13;
import lombok.Data;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
public class Nested1 {
    @Id
    @GeneratedValue
    private Long id;

    @OneToMany(cascade = CascadeType.ALL)
    private Set<Nested11> nested11;
    @OneToMany(cascade = CascadeType.ALL)
    private Set<Nested12> nested12;
    @OneToMany(cascade = CascadeType.ALL)
    private Set<Nested13> nested13;

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Nested1)) return false;
        final Nested1 other = (Nested1) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$id = this.getId();
        final Object other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
        final Object this$nested11 = this.getNested11();
        final Object other$nested11 = other.getNested11();
        if (this$nested11 == null ? other$nested11 != null : !this$nested11.equals(other$nested11)) return false;
        final Object this$nested12 = this.getNested12();
        final Object other$nested12 = other.getNested12();
        if (this$nested12 == null ? other$nested12 != null : !this$nested12.equals(other$nested12)) return false;
        final Object this$nested13 = this.getNested13();
        final Object other$nested13 = other.getNested13();
        if (this$nested13 == null ? other$nested13 != null : !this$nested13.equals(other$nested13)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Nested1;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $id = this.getId();
        result = result * PRIME + ($id == null ? 43 : $id.hashCode());
        final Object $nested11 = this.getNested11();
        result = result * PRIME + ($nested11 == null ? 43 : $nested11.hashCode());
        final Object $nested12 = this.getNested12();
        result = result * PRIME + ($nested12 == null ? 43 : $nested12.hashCode());
        final Object $nested13 = this.getNested13();
        result = result * PRIME + ($nested13 == null ? 43 : $nested13.hashCode());
        return result;
    }
}
