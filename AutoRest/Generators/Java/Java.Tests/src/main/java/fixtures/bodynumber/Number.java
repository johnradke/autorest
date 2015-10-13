/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 * 
 * Code generated by Microsoft (R) AutoRest Code Generator 0.11.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.bodynumber;

import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceException;
import retrofit.Call;
import com.squareup.okhttp.ResponseBody;
import retrofit.http.GET;
import retrofit.http.PUT;
import retrofit.http.Body;

/**
 * An instance of this class provides access to all the operations defined
 * in Number.
 */
public interface Number {
    /**
     * The interface defining all the services for Number to be
     * used by Retrofit to perform actually REST calls.
     */
    interface NumberService {
        @GET("/number/null")
        Call<ResponseBody> getNull();

        @GET("/number/invalidfloat")
        Call<ResponseBody> getInvalidFloat();

        @GET("/number/invaliddouble")
        Call<ResponseBody> getInvalidDouble();

        @PUT("/number/big/float/3.402823e+20")
        Call<ResponseBody> putBigFloat(@Body double numberBody);

        @GET("/number/big/float/3.402823e+20")
        Call<ResponseBody> getBigFloat();

        @PUT("/number/big/double/2.5976931e+101")
        Call<ResponseBody> putBigDouble(@Body double numberBody);

        @GET("/number/big/double/2.5976931e+101")
        Call<ResponseBody> getBigDouble();

        @PUT("/number/big/double/99999999.99")
        Call<ResponseBody> putBigDoublePositiveDecimal(@Body double numberBody);

        @GET("/number/big/double/99999999.99")
        Call<ResponseBody> getBigDoublePositiveDecimal();

        @PUT("/number/big/double/-99999999.99")
        Call<ResponseBody> putBigDoubleNegativeDecimal(@Body double numberBody);

        @GET("/number/big/double/-99999999.99")
        Call<ResponseBody> getBigDoubleNegativeDecimal();

        @PUT("/number/small/float/3.402823e-20")
        Call<ResponseBody> putSmallFloat(@Body double numberBody);

        @GET("/number/small/float/3.402823e-20")
        Call<ResponseBody> getSmallFloat();

        @PUT("/number/small/double/2.5976931e-101")
        Call<ResponseBody> putSmallDouble(@Body double numberBody);

        @GET("/number/small/double/2.5976931e-101")
        Call<ResponseBody> getSmallDouble();

    }
    /**
     *
     * @return the Double object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    Double getNull() throws ServiceException;

    /**
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    Call<ResponseBody> getNullAsync(final ServiceCallback<Double> serviceCallback);

    /**
     *
     * @return the Double object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    Double getInvalidFloat() throws ServiceException;

    /**
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    Call<ResponseBody> getInvalidFloatAsync(final ServiceCallback<Double> serviceCallback);

    /**
     *
     * @return the Double object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    Double getInvalidDouble() throws ServiceException;

    /**
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    Call<ResponseBody> getInvalidDoubleAsync(final ServiceCallback<Double> serviceCallback);

    /**
     *
     * @param numberBody the double value
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    void putBigFloat(double numberBody) throws ServiceException;

    /**
     *
     * @param numberBody the double value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    Call<ResponseBody> putBigFloatAsync(double numberBody, final ServiceCallback<Void> serviceCallback);

    /**
     *
     * @return the Double object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    Double getBigFloat() throws ServiceException;

    /**
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    Call<ResponseBody> getBigFloatAsync(final ServiceCallback<Double> serviceCallback);

    /**
     *
     * @param numberBody the double value
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    void putBigDouble(double numberBody) throws ServiceException;

    /**
     *
     * @param numberBody the double value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    Call<ResponseBody> putBigDoubleAsync(double numberBody, final ServiceCallback<Void> serviceCallback);

    /**
     *
     * @return the Double object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    Double getBigDouble() throws ServiceException;

    /**
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    Call<ResponseBody> getBigDoubleAsync(final ServiceCallback<Double> serviceCallback);

    /**
     *
     * @param numberBody the double value
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    void putBigDoublePositiveDecimal(double numberBody) throws ServiceException;

    /**
     *
     * @param numberBody the double value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    Call<ResponseBody> putBigDoublePositiveDecimalAsync(double numberBody, final ServiceCallback<Void> serviceCallback);

    /**
     *
     * @return the Double object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    Double getBigDoublePositiveDecimal() throws ServiceException;

    /**
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    Call<ResponseBody> getBigDoublePositiveDecimalAsync(final ServiceCallback<Double> serviceCallback);

    /**
     *
     * @param numberBody the double value
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    void putBigDoubleNegativeDecimal(double numberBody) throws ServiceException;

    /**
     *
     * @param numberBody the double value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    Call<ResponseBody> putBigDoubleNegativeDecimalAsync(double numberBody, final ServiceCallback<Void> serviceCallback);

    /**
     *
     * @return the Double object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    Double getBigDoubleNegativeDecimal() throws ServiceException;

    /**
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    Call<ResponseBody> getBigDoubleNegativeDecimalAsync(final ServiceCallback<Double> serviceCallback);

    /**
     *
     * @param numberBody the double value
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    void putSmallFloat(double numberBody) throws ServiceException;

    /**
     *
     * @param numberBody the double value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    Call<ResponseBody> putSmallFloatAsync(double numberBody, final ServiceCallback<Void> serviceCallback);

    /**
     *
     * @return the Double object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    Double getSmallFloat() throws ServiceException;

    /**
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    Call<ResponseBody> getSmallFloatAsync(final ServiceCallback<Double> serviceCallback);

    /**
     *
     * @param numberBody the double value
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    void putSmallDouble(double numberBody) throws ServiceException;

    /**
     *
     * @param numberBody the double value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    Call<ResponseBody> putSmallDoubleAsync(double numberBody, final ServiceCallback<Void> serviceCallback);

    /**
     *
     * @return the Double object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    Double getSmallDouble() throws ServiceException;

    /**
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    Call<ResponseBody> getSmallDoubleAsync(final ServiceCallback<Double> serviceCallback);

}
