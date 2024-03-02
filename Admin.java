package keysat.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;

@Entity(name = "admin")
@Table(name = "admin")
@PrimaryKeyJoinColumn(
        name = "admin_id",
        referencedColumnName = "user_id",
        foreignKey = @ForeignKey(name = "admin_user_id_fkey")
)
public class Admin extends User {
}
