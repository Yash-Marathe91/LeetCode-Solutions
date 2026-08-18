class BrowserHistory {

    private String[] history;
    private int curr;
    private int last;

    public BrowserHistory(String homepage) {
        history = new String[5005]; 
        history[0] = homepage;
        curr = 0;
        last = 0;
    }
    
    public void visit(String url) {
        curr++;
        history[curr] = url;
        last = curr; 
    }
    
    public String back(int steps) {
        curr = Math.max(0, curr - steps);
        return history[curr];
    }
    
    public String forward(int steps) {
        curr = Math.min(last, curr + steps);
        return history[curr];
    }
}