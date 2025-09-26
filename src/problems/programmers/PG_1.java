package problems.programmers;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.Map;

public class PG_1 {
	public void solve() throws MalformedURLException, UnsupportedEncodingException {
		String url = "https://mportal.cau.ac.kr/common/auth/SSOlogin.do?redirectUrl=https%3A%2F%2Fsso2.cau.ac.kr%2Fsso%2FSTSWeb%2Fconnectsts.aspx%3Flogin_hint%3Dgks1354%2540cau.ac.kr%26mkt%3Dko-KR%26client-request-id%3D5504b0f0-a995-4dbd-84f3-4f10c0a39949%26username%3Dgks1354%2540cau.ac.kr%26wa%3Dwsignin1.0%26wtrealm%3Durn%253afederation%253aMicrosoftOnline%26wctx%3Destsredirect%253d2%2526estsrequest%253drQQIARAAhVJPaNt2GJXsxLG9rnWyMXrMzA6jYFl_7chQWPwnrmzLlm0piTWKkGXJUizpp0g_W7JKbjuMncLYDutxO4yVHcpOozAojF1yGDnn1ONYoSvrYYGxMZteetvj4_H4eIeP973s1h7GYjiG30kSGFH5AH-NUmHNBdwwiIKmr9Ub8HeyuZePN6Qvv_uJ_-RVL_f0m6-4R-j7JoReUCkWPeBD1caAYViajmnAKdqqO7Hc6Y8oeomiv6Ho54nt6SwgKIb-SFPnmKphM_9hYnMGCu3Bo0RQovZYkmVxmqJLLFveIwisd8Tj_FF3NnI4KNdnTHeJ472mPOuI5monwRE5IuWmFPNxg5TF6glfb1lyvRH16hLkY23Jr_yyI1EdcRatvJAX-8woNh2-ztOyI8-uErd6-3NokmsCvhXrfyYyBvAdxQMBfJj8NtHzdJeb1IDr6hrE1jbdhZamQgu4gg883YeWHtwdDEsW7EjDcHS4AE0StkidVMx6d8hN3VEsnQbVwvC40SlA1eoeKI2qHy5pgNtijQSeX2ftqSn0R6XaUiSaoDpWy612MA_GLUUb0tS4JRp0KyoJeMeyXaMgGHOZ6EpRNY6NeH8w4Rd6oeqM2we2tM90qHGTPLEj5thkjxahKdSMAdtxj3qNxcEBc6jWCZaK8GkIBuEgJkJ-ELX7HVqIHL4rhzoJfU4ZAu3UqrGjKWeW58u2HXVtRiNOQvqQ4UJyud8Shh7T6_DevZP-uNCIF_Kp9EMytfq4A9yL5M1VKK412fV8YFi2frmB_r7xXjqdy9xGdpEP38U3K-l0Nnfr9tYucr2Bfr25apWZrnzxCuKN703mn7_iX5CLzaIcNFTtmHGHhLGnFimvJi8cL2YErkiJRDGMrfK07y5Ve1Kk7-IV4jyFnqdST1KZdDKH5JM1gbhIZbi60m2IdJl8mUI_3UKeZP6_q5dvoVc33slm55ZiA0219WDndT-vbtDZlGarlhPs3HmQtyYKBDPdzVce5CMnUDRtrRaqPdeDfOXj_OqA_P2zs7OnbyPXN__94-fPfn3-94t7j3PIs9VsI9fb54n_AA2";
		URL url1 = new URL(url);
		Map<String, String> map = getQueryMap(url1.getQuery());
        String redirectUrl = URLDecoder.decode(map.get("redirectUrl"), "UTF-8");

        URL url2 = new URL(redirectUrl);
        Map<String, String> map2 = getQueryMap(url2.getQuery());
        System.out.println(map2);
	}

	public static void main(String[] args) throws MalformedURLException, UnsupportedEncodingException {
		new PG_1().solve();
	}

	/** URL에서 파라미터를 파싱한다 **/
	public static Map<String, String> getQueryMap(String query) {
		if (query == null)
			return null;

		int pos1 = query.indexOf("?");
		if (pos1 >= 0) {
			query = query.substring(pos1 + 1);
		}

		String[] params = query.split("&");
		Map<String, String> map = new HashMap<String, String>();
		for (String param : params) {
			String name = param.split("=")[0];
			String value = param.split("=")[1];
			map.put(name, value);
		}
		return map;
	}
}
