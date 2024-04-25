hashset
 - set 인터페이스에서 지원하는 구현 클래스이다.
 - 순서대로 입력되지 않고, 일정하게 유지되지 않는다.
 - null 요소도 허용이 된다.
 - 중복을 허용하지 않는다. ( 매력적인 부분 )

HashMap
- ValueType put(KeyType, ValueType value)
  - HashMap에 데이터를 저장한다. 첫 번째 매개변수는 하당 데이터의 key 값, 두 번째 매개변수는 해당 key에 해당하는 value 값이다.
  - 반환하는 값은 해시맵 내에 동일한 key에 해당하는 값이 있다면 그 key에 대한 value를 반환한다.
- ValueType get(KeyType key)
  - key 값에 대한 value 값을 반환한다.
- ValueType getOrDefault(KeyType key, 0)
  - key값에 대한 value 값을 반환한다. key값이 없으면 default값인 0을 반환한다.
- ValueType romove(keyType key)
  - HashMap에서 key에 해당하는 데이터를 삭제한다.
- boolean containsKey(KeyType key)
  - HashMap 안에 해당 key가 있다면 true, 없다면 false를 반환한다.
- void clear()
  - HashMap 안의 모든 데이터를 삭제한다.
- int isEmpty()
  - HashMap 안에 데이터가 없다면 true, 있다면 false를 반환한다.
- int size()
  - HashMap 안에 있는 데이터의 개수를 반환한다.

중복을 걸러내는 과정
 - 객체를 저장하기 전에 먼저 객체의 hashCode() 메소드를 호출해서
   hashCode를 얻어 낸 다음 저장되어 있는 객체들의 hashCode와 비교한 뒤 
   같은 hashCode가 있다면 다시 equals()메소드로
   두 객체를 비교해서 true가 나오면 동일한 객체로 판단하고
   중복 저장을 하지 않는다.

   선언
   HashSet<Integer> set = new HashSet<Integer>();

   메소드
   add(value) : 값을 추가
   remove(value) : 값 제거
   clera() : 모든 값 삭제
   size() : HashSet 크기
   contains(value) : 값의 여부를 확인

   출력
   System.out.println(set); // 전체 출력

   - get 메소드가 존재하지 않아서 하나의 객체를 가지고 올 수가 없다.
   - 하나의 객체를 가져오기 위해서는 Iterator를 사용해야 한다.
   		- 전체 객체를 대상으로 한 번씩 반복해서 가져오는 반복자이다.
   		- Iterator()메소드를 호출하면 얻을 수 있다.
   		- Iterator()에서 하나의 객체를 가져올 때는 next()를 사용한다.
   		- 먼저 가져올 객체가 있는지 확인하기 위해 hasNext()를 사용하여
   			확인하는것이 좋다.
   			- hasNext()메소드는 가져올 객체가 있으면 true 없으면 false 반환

Iterator iter = set.iterator();
while(iter.hasNext()){
	System.out.println(iter.next());
}


작성되는 변수
매개변수 > 멤버변수 

패키지

쇼핑몰 시스템 개발

작은 프로그램 클래스
Order
User
Product

큰 프로그램 클래스
User , UserManager 등등

위의 클래스를 아래와 같이 분류하면,
*user
  *User 등등

패키지 주의사항
1. 패키지는 사용하는 경우 항상 코드 첫 줄에 패키지 이름을 적어주어야 한다.
2. 패키지의 이름과 위치는 폴더(디렉터리) 위치와 같아야 한다. (필수)
3. 패키지의 이름은 모두 소문자를 사용한다. (관례)
4. 패키지의 이름의 앞 부분에는 일반적으로 회사의 도메인 이름을 거꾸로 사용한다.
  - com.company.myapp과 같이 사용한다. (관례)
  - 수 많은 외부 라이브러리가 함께 사용되면 같은 패키지에 같은 클래스 이름이 존재할 수도 있다.
  - 이렇게 도메인 이름을 거꾸로 사용하면 이런 문제를 방지할 수 있다.
  - 오픈소스나 라이브러리를 만들어서 외부에 제공한다면 위의 관례를 꼭 지키는 것이 좋다.
  - 내가 만든 애플리케이션을 다른 곳에 공유하지 않고, 직접 배포한다면 보통 문제가 되지 않는다.

com.sungilshop

user
  User
  UserService
product
  Product
  ProductService
order
  Order
  OrderService
  OrderHistory


접근제어자
  - 자바는 접근제어자를 제공한다.
  - 접근제어자를 사용하면 해당 클래스 외부에서 특정 필드나 메서드에 접근하는 것을 제한할 수 있다.

예를 들어,
스피커에 들어가는 소프트웨어를 개발한다고 가정.

요구사항 - 음량은 절대로 100을 초과하면 안된다. -> 부품이 고장.

스피커는 볼륨증가, 볼륨감소, 현재음량 확인하는 기능만 구현한다.
  - 볼륨은 10씩 증가 또는 감소
  - 켤 때는 생성자를 통해 초기값(초기음량) 적용할 수 있게 한다.
요구사항은 꼭 지켜서 개발한다.


접근 제어자 종류
  - 자바는 4가지 종류의 접근 제어자를 제공

접근 제어자의 종류
1. private : 모든 외부 호출을 막는다.
2. default : 같은 패키지 안에서 호출은 허용한다.
3. protected : 같은 패키지 안에서 호출은 허용한다. 패키지가 달라도 상속 관계의 호출은 허용한다.
4. public : 모든 외부 호출을 허용한다.

private -> default -> protected -> public

접근 제어자는 필드와 메서드, 생성자에 사용된다.
클래스 레벨에도 일부 접근 제어자를 사용할 수 있다. (public, default)
