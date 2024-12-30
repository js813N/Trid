package orders.model;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import common.domain.PagingDTO;
import orders.domain.OrderDTO;

public interface OrderDAO {

	// 주문의 전체 행 개수를 불러오는 메소드
	int selectTotalRowCount(Map<String, Object> paraMap) throws SQLException;

	// 관리자에서 사용 주문 내역을 불러오는 메소드
	List<OrderDTO> selectOrderList(Map<String, Object> paraMap) throws SQLException;

	// 관리자에서 주문 상세 내역을 불러오는 메소드
	OrderDTO selectOrderByAdmin(String orderNo) throws SQLException;

	// 관리자에서 주문 상태를 변경하는 메소드
	int updateOrderStatus(String orderNo, String orderStatus) throws SQLException;

}