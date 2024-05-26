package lesson31.classwork2405.example02;

import java.util.Stack;

public class TabHistory {
    private Stack<String> forwarStack;
    private Stack<String> backwardStack;
    private String currentPage;

    public TabHistory(String homePage) {
        currentPage = homePage;
        forwarStack = new Stack<>();
        backwardStack = new Stack<>();
    }

    public String goBack() {
        if (backwardStack.isEmpty()) {
            return null;
        }
        forwarStack.push(currentPage);
        currentPage = backwardStack.pop();
        return currentPage;
    }


    public String goForward() {
        if (forwarStack.isEmpty()) {
            return null;
        }
        backwardStack.push(currentPage);
        currentPage = forwarStack.pop();
        return currentPage;
    }

    public void goToPage(String url) {
        forwarStack.clear();
        backwardStack.push(currentPage);
        currentPage = url;
    }

    public String getCurrentPage() {
        return currentPage;
    }
}
