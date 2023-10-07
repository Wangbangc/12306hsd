import axios from "axios";

let fetchLogin;
fetchLogin = async (body) => {
    let data;
    ({data} = await axios({
        method: 'POST',
        url: 'http://localhost:8081/user/login',
        data: body
    }));
    // http.defaults.headers.common['Authorization'] = data.data?.accessToken
    return data
};
export {
    fetchLogin,

}
