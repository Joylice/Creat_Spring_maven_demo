package demo.proxy.test;

public class ForumServiceImpl implements ForumService {

	public Object removeTopic(int topicId) {
		// 开始对该方法进行性能监视
//		PerformanceMonitor.begin("demo.proxy.test.ForumServiceImpl.removeTopic");

		System.out.println("模拟删除Topic记录" + topicId);

		try {
			Thread.currentThread().sleep(20);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}

		// 结束对该方法进行性能监视
//		PerformanceMonitor.end();
		return 1 ;
	}

	public void removeForum(int forumId) {
		// 開始對該方法進行性能監視
//		PerformanceMonitor.begin("demo.proxy.test.ForumServiceImpl.removeForum");
		System.out.println("模擬刪除Forum記錄" + forumId);
		try {
			Thread.currentThread().sleep(40);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		// 结束对该方法进行性能监视
//		PerformanceMonitor.end();
	}
}
