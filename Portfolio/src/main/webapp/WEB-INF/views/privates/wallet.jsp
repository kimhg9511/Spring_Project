<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ page session="false"%>

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
			<!-- perPageNum의 값을 정하는 select 박스 -->
			<select class="form-control" id="perPageSel">
				<option value="10">10</option>
				<option value="15">15</option>
				<option value="20">20</option>
			</select>
			<div class="table-responsive">

				<!-- 데이터 출력 -->
				<table class="table table-bordered" id="dataTable" width="100%"
					cellspacing="0">
					<thead>
						<tr>
							<th>번호</th>
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
							<th>번호</th>
							<th>종목</th>
							<th>매수</th>
							<th>매도</th>
							<th>실현손익</th>
							<th>거래일시</th>
							<th>총자산</th>
						</tr>
					</tfoot>

					<tbody>
						<c:forEach items="${list}" var="walletVO">
							<!-- model의 속성 list에 담겨있는 조회결과를 차례로 walletVO에 대입 -->
							<tr>
								<td><a
									href="/privates/wallet${pageMaker.makeQuery(pageMaker.cri.page)}&trno=${WalletVO.trno}">${WalletVO.name}</a></td>
								<td>${ walletVO.name }</td>
								<td>${ walletVO.buy }</td>
								<td>${ walletVO.sell }</td>
								<td>${ walletVO.benefit }</td>
								<td><fmt:formatDate pattern="YYYY-MM-dd HH:mm:ss"
										value="${ walletVO.trdate }" /></td>
								<td>${ walletVO.totalmoney }</td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
			<nav aria-label="pagination">
				<ul class="pagination">

					<!-- prev 버튼 -->
					<li id="page-prev"><a
						href="wallet${pageMaker.makeQuery(pageMaker.startPage)}"
						aria-label="Prev"> <span aria-hidden="true">«</span>
					</a></li>

					<!-- 페이지 번호 (시작 페이지 번호부터 끝 페이지 번호까지) -->
					<c:forEach begin="${pageMaker.startPage}"
						end="${pageMaker.endPage}" var="idx">
						<li id="page${idx}"><a
							href="wallet${pageMaker.makeQuery(idx)}"> <!-- 시각 장애인을 위한 추가 -->
								<span>${idx}<span class="sr-only">(current)</span></span>
						</a></li>
					</c:forEach>
					<!-- next 버튼 -->
					<li id="page-next"><a
						href="wallet${pageMaker.makeQuery(pageMaker.endPage)}"
						aria-label="Next"> <span aria-hidden="true">»</span>
					</a></li>

				</ul>
			</nav>
		</div>
	</div>
</div>
<!-- /.container-fluid -->



