package http;

import java.util.HashMap;
import java.util.Map;

public class HttpSessions {
    private static Map<String, HttpSession> sessions = new HashMap<>();

    public static HttpSession getSession(String id) {
        HttpSession session = sessions.get(id);

        // 만약 찾는 사용자에 대한 세션이 없다면, 새로 만들어서 반환
        if (session == null) {
            session = new HttpSession(id);
            sessions.put(id, session);
        }

        return session;
    }

    public static void remove(String id) {
        sessions.remove(id);
    }
}
