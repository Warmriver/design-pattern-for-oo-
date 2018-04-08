### 设计模式之代理模式

Proxy模式有多种用途

    - Remote Proxy 远程代理不直接持有对象的引用，可以隐藏一个对象存在于不同地址空间的事实。
    - virtual Proxy 虚拟代理，进行优化
    - protection Proxy/ smart reference 进行附加的内容处理，例如添加事务

springmvc架构的aop功能就是基于动态代理的，对原本对象的调用中添加前后通知进行事务操作。动态代理允许一个代理类代理不同的类，在java中，原生的动态代理使用如下
```
    class DynamicProxyHandler implements InvocationHandler {
        private Object proxied;
        public DynamicProxyHandler(Object proxied){
            this.proxied = proxied;
        }
        // 需要实现invoke方法
        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            System.out.println("proxy: " + proxy.getClass() + ", method: " + method + ", args: "+args);
            if(args !=null){
                for(Object arg : args){
                    System.out.println(" " + args);
                }
            }
            return method.invoke(proxy, args);
            
        }
    }

```
