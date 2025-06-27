package burgerhomework;

public class BurgerMenu {
	* Class   
	   1. BurgerMain      //메인클래스
	   2. OrderManager      //관리시스템
	   3. PurchaseOrder    // 주문서
	   4. Burger         //버거 정보
	   5. BurgerMenu      //버거 메뉴 정보
	   6. Customer      //고객 정보

	1. BurgerMain      //메인클래스
	필드
	   OrderManager orderManager;
	메소드
	   boolean isCorrectPhoneNumber(String phoneNumber)
	   boolean login(String phoneNumber)
	   Customer createCustomerInfo(Scanner sc, String phoneNumber)
	   boolean checkInput(String str, Scanner sc)
	   void printMenu()
	   BurgerMenu inputMenu(Scanner sc)
	   void printPurchaseOrder(PurchaseOrder[] purchaseOrderArr)

	   public static void main(String[] args)

	2. OrderManager   //관리시스템
	필드
	   int totalMoney;
	   final int MAX_ORDER_COUNT;

	   final int MAX_BURGER;
	   

	   int currentOrderCount;
	   PurchaseOrder[] purchaseOrderArr;

	   BurgerMenu[] burgerMenuArr;

	   final int MIN_ORDER_AMOUNT;

	   int currentCustomerCount;
	   Customer[] customerArr;
	생성자
	   public OrderManager()
	메소드
	   BurgerMenu getBurgerItem(int burgerId)
	   int[] getBurgerMenuIdArr()
	   int isExistCustomer(String phoneNumber)
	   boolean addCustomer(Customer customer)
	   boolean canOrder()
	   boolean sell(String phoneNumber, Burger[] burgerList)
	   boolean refund(String phoneNumber, int orderNumber)
	   int[] canRefund(String phoneNumber, int orderNumber)
	   int isExistOrderNumber(String phoneNumber, int orderNumber)
	   int isExistOrderNumber(int orderNumber)
	   boolean deliver(int total)
	   PurchaseOrder[] getPurchaseOrder(String phoneNumber)

	3. PurchaseOrder    // 주문서
	필드
	   static int currentOrderNumber;
	   int orderNumber;
	   String phoneNumber;
	   
	   Burger[] burgerList;
	   int total;
	생성자
	   public PurchaseOrder(String phoneNumber, Burger[] burgerList)
	메소드
	   void initBurgerList(Burger[] burgerList)
	   int calculateTotal()

	4. Burger         //버거 정보
	필드
	   int burgerId;
	   String burgerName;
	   int price;
	   
	   boolean isSet;
	생성자
	   public Burger(int burgerId, String burgerName, int price, boolean isSet)
	5. BurgerMenu      //버거 메뉴 정보
	필드
	   static int currentBurgerId;
	   
	   int burgerId;
	   
	   int burgerPrice;
	   int setPrice;

	   String burgerName;
	생성자   
	   public BurgerMenu(int burgerId, String burgerName, int burgerPrice, int setPrice)
	메소드
	   public int getPrice(boolean isSet) 
	   public int getSetPrice() 
	   public int getBurgerPrice(
	6. Customer      //고객 정보
	필드
	   String name;
	   String address;
	   String phoneNumber;
	   
	   int[] orderNumberArr;
	생성자
	   public Customer(String name, String address, String phoneNumber)
	   public Customer(String name, String address, String phoneNumber, int orderMaxCount)
	메소드
	   void initOrderNumberArr(int orderMaxCount)
	   int isExistOrderNumber(int orderNumber)
	   boolean addOrder(int orderNumber)
	   boolean refundOrder(int orderNumber)
	   int addOrderNumberArrIdx()
	   * Class   
	   1. BurgerMain      //메인클래스
	   2. OrderManager      //관리시스템
	   3. PurchaseOrder    // 주문서
	   4. Burger         //버거 정보
	   5. BurgerMenu      //버거 메뉴 정보
	   6. Customer      //고객 정보

	
	
	

	5. BurgerMenu      //버거 메뉴 정보
	필드
	   static int currentBurgerId;
	   
	   int burgerId;
	   
	   int burgerPrice;
	   int setPrice;

	   String burgerName;
	생성자   
	   public BurgerMenu(int burgerId, String burgerName, int burgerPrice, int setPrice)
	메소드
	   public int getPrice(boolean isSet) 
	   public int getSetPrice() 
	   public int getBurgerPrice(
	
	   
}
