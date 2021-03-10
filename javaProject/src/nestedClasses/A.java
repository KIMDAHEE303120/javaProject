package nestedClasses;

//바깥 클래스 A

class A {
	A() {
		System.out.println("A객체가 생성됨");
	}

	// 인스턴스 멤버 클래스 B
	class B {
		B() {
			System.out.println("B객체가 생성됨");
		}

		int field1;

		// static int field2;
		void method1() {
		}
		// static method2() {}
	}

	// 정적 멤버 클래스 C
	static class C {
		C() {
			System.out.println("C객체가 생성됨");
		}

		int field1;
		static int field2;

		void method1() {
		}

		static void method2() {
		}

	}

	// 로컬 멤버 클래스 D
	void method() {
		class D {
			D() {
				System.out.println("D객체가 생성됨");
			}

			int field1;

			// static int field2;
			void method1() {
			}
			// static void method2() {}
		}
		D d = new D();
		d.field1 = 3;
		d.method1();

	}
}
