package GoF.Template.Ex1.dp;

public abstract class AbstGameConnectHelper {
    protected abstract String doSecurity(String string);
    protected abstract boolean authentication(String id, String password);
    protected abstract int authorization(String userName);
    protected abstract String connection(String info);

    public String requestConnection(String encodeInfo){
        String decodedInfo = doSecurity(encodeInfo);
        String id = "aaa";
        String password = "bbb";
        if(!authentication(id, password)){
            throw new Error("아이디 암호 불일치");
        }

        String userName = "userName";
        int i = authorization(userName);
        switch (i){
            case -1:
                throw new Error("셧다운");
            case 0: // manager
                break;
            case 1: // 유료
                break;
            case 2: // 무료
                break;
            case 3: // 권한 없음
                break;
            default:    // 기타

                break;

        }


        return connection(decodedInfo);
    }
}
