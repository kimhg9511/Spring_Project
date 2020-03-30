<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ page session="false"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<div class="container-fluid">

	<!-- Page Heading -->
	<h1 class="h3 mb-2 text-gray-800">Wallets</h1>
	<p class="mb-4">지갑의 정보를 저장하는 테이블입니다.</p>

	<!-- DataTales Example -->
	<div class="card shadow mb-4">
		<div class="card-header py-3">
			<h6 class="m-0 font-weight-bold text-primary">거래내역</h6>
		</div>
		<div class="card-body">
			<div class="table-responsive">
				<table class="table table-bordered" id="dataTable" width="100%"
					cellspacing="0">
					<thead>
						<tr>
							<th>종목</th>
							<th>매수</th>
							<th>매도</th>
							<th>실현손익</th>
							<th>거래일시</th>
							<th>총자산</th>
						</tr>
					</thead>

					<tfoot>
						<tr>
							<th>종목</th>
							<th>매수</th>
							<th>매도</th>
							<th>실현손익</th>
							<th>거래일시</th>
							<th>총자산</th>
						</tr>
					</tfoot>
					<tbody>
						<%-- <c:forEach items="${list}" var="walletVO">
							<!-- model의 속성 list에 담겨있는 조회결과를 차례로 walletVO에 대입 -->
							<tr>
								<td><a href="/board/read?bno=${walletVO.bno}">${ walletVO.title }</a></td>
								<td>${ walletVO.trname }</td>
								<td>${ walletVO.buy }</td>								
								<td>${ walletVO.sell }</td>
								<td>${ walletVO.benefit }</td>
								<td><fmt:formatDate pattern="YYYY-MM-dd HH:mm:ss"
										value="${ walletVO.trdate }" /></td>
								<td>${ walletVO.totalmoney }</td>
							</tr>
						</c:forEach> --%>
					</tbody>
				</table>
			</div>
		</div>
	</div>

</div>
<!-- /.container-fluid -->
