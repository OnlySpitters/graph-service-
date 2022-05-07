
import lombok.Builder;
import org.neo4j.ogm.annotation.*;

@ConnectionsEntity("IS_GROUPIE")
@Builder
public class Connection {

    @Id
    @GeneratedValue
    private Long id;
    private String role;

    @StartNode
    private User startNode;

    @EndNode
    private User endNode;
}