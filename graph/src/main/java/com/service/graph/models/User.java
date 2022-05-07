


import java.util.Set;

@Data
@Builder
@NodeEntity
public class User {
    @Id
    @Role
    @GeneratedValue
    private Long id;
    private String userId;
    private String userRole;
    private String userHandle;
    private String name;
    private String profiePicture;

    @Relationship(type = "IS_GROUPIE")
    private Set<Connection> connections;
}