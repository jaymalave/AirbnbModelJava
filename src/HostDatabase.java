import java.util.Vector;

public class HostDatabase {
	
	 Vector<Host> hosts = new Vector<Host>();
	 
	 public void addHost(Host host){
		 hosts.add(host);
	 } 
	 
	 public Host getHost(int index){
		    Host host = hosts.get(index);
			return host;
	 }
}
