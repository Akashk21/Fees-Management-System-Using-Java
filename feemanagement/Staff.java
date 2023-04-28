package feemanagement;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "staff", catalog = "fee", schema = "")
@NamedQueries({
    @NamedQuery(name = "Staff.findAll", query = "SELECT s FROM Staff s")
    , @NamedQuery(name = "Staff.findBySId", query = "SELECT s FROM Staff s WHERE s.sId = :sId")
    , @NamedQuery(name = "Staff.findBySUser", query = "SELECT s FROM Staff s WHERE s.sUser = :sUser")
    , @NamedQuery(name = "Staff.findBySPass", query = "SELECT s FROM Staff s WHERE s.sPass = :sPass")})
public class Staff implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "s_id")
    private Integer sId;
    @Basic(optional = false)
    @Column(name = "s_user")
    private String sUser;
    @Basic(optional = false)
    @Column(name = "s_pass")
    private String sPass;

    public Staff() {
    }

    public Staff(Integer sId) {
        this.sId = sId;
    }

    public Staff(Integer sId, String sUser, String sPass) {
        this.sId = sId;
        this.sUser = sUser;
        this.sPass = sPass;
    }

    public Integer getSId() {
        return sId;
    }

    public void setSId(Integer sId) {
        Integer oldSId = this.sId;
        this.sId = sId;
        changeSupport.firePropertyChange("SId", oldSId, sId);
    }

    public String getSUser() {
        return sUser;
    }

    public void setSUser(String sUser) {
        String oldSUser = this.sUser;
        this.sUser = sUser;
        changeSupport.firePropertyChange("SUser", oldSUser, sUser);
    }

    public String getSPass() {
        return sPass;
    }

    public void setSPass(String sPass) {
        String oldSPass = this.sPass;
        this.sPass = sPass;
        changeSupport.firePropertyChange("SPass", oldSPass, sPass);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (sId != null ? sId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Staff)) {
            return false;
        }
        Staff other = (Staff) object;
        if ((this.sId == null && other.sId != null) || (this.sId != null && !this.sId.equals(other.sId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "feemanagement.Staff[ sId=" + sId + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
