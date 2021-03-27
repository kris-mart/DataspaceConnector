package de.fraunhofer.isst.dataspaceconnector.model;

import lombok.AccessLevel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.List;

/**
 * A contract agreement is an agreement between two parties on access and usage behaviours.
 */
@Data
@Entity
@Table
@EqualsAndHashCode(callSuper = false)
@Setter(AccessLevel.PACKAGE)
public class Agreement extends AbstractEntity {

    /**
     * Serial version uid.
     **/
    private static final long serialVersionUID = 1L;

    /**
     * Indicates whether both parties have agreed.
     */
    private boolean confirmed;

    /**
     * The definition of the contract.
     **/
    private String value;

    /**
     * The artifacts this agreement refers to.
     */
    @ManyToMany(mappedBy = "agreements")
    private List<Artifact> artifacts;
}
