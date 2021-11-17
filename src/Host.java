import java.util.Date;

public class Host {
    int host_id;
    String full_name;
    Date created_at;
    boolean is_super_host;
    String email;
    
    Host(int host_id, String full_name, Date created_at, boolean is_super_host, String email){
    	this.host_id = host_id;
    	this.full_name = full_name;
    	this.created_at = created_at;
    	this.is_super_host = is_super_host;
    	this.email = email;
    }  
}

