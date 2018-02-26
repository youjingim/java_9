package com.yj.s2;

	public class Customer {
		private int don;
		private int point;
		
		public void buy(Product [] products) {
			for(int i=0;i<products.length;i++) {
				this.don = this.don - products[i].getPrice();
				this.point = this.point + products[i].getPoint();
			}

			System.out.println("현재 남은 돈 : "+don);
			System.out.println("현재 누적포인트 : "+point);
		}
		
		public void buy(Product p) {
			//물건값 계산
			don=don-p.getPrice();
			this.point=this.point+p.getPoint();
			//instancefo 연산자 return true , false
			//해당 참조 변수가 어떤 클레스 타입인지 판별
			if(p instanceof Tv) {
				Tv t = (Tv)p;
				System.out.println(t.getBrand());
			} else if (p instanceof Computer) {
				Computer c = (Computer)p;
				System.out.println(c.getCpu());
			} else {
				Phone phone = (Phone)p;
				
			}
			//포인트계산
			System.out.println("현재 남은 돈 : "+don);
			System.out.println("현재 누적포인트 : "+point);
			
			
		}
		public int getDon() {
			return don;
		}
		public void setDon(int don) {
			this.don = don;
		}
		public int getPoint() {
			return point;
		}
		public void setPoint(int point) {
			this.point = point;
		}
		
	}


