@EJB(lookup = "java:global/myapp-business/myapp-services/CustomerFacadeBean")

public class EJBRemote {
    public void remote(){
        System.out.println("Remote EJB invoked")
    }
}